package lk.ijse.notecollector.controller;

import lk.ijse.notecollector.dto.impl.UserDTO;
import lk.ijse.notecollector.service.UserService;
import lk.ijse.notecollector.service.UserServiceImpl;
import lk.ijse.notecollector.utill.AppUtill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Arrays;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;
    /*PostMan Content Type - multipart/form-data; boundary=<calculated when request is sent> */
    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public UserDTO saveUser( @RequestPart("firstName") String firstName,/*ena request eke part ekak thiynwa firstname kiyla eywa me firstNameta assign karanna*/
                             @RequestPart("lastName")String lastName,
                             @RequestPart("email")String email,
                             @RequestPart("password")String password,
                             @RequestPart("profilePic") MultipartFile profilePic)
    {
        //convert profile pic into Base64
        System.out.println("RAW pro pic " + profilePic);
        String base64ProfilePic = ""; //appUtill eken return krnne string ekak eka allagnna thma empty string eka
        try{
            byte[] bytesProPic = profilePic.getBytes();
            base64ProfilePic = AppUtill.profilePicToBase64(bytesProPic); //argument eka widihata pass krnne [] eka eka apputill eken return krnne string nisa assign krnwa string ekakata
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //generate user id
        String usersId = AppUtill.generateUserId();
        //build the object
        var buildUserDt0 = new UserDTO();
        buildUserDt0.setUserId(usersId);
        buildUserDt0.setFirstName(firstName);
        buildUserDt0.setLastName(lastName);
        buildUserDt0.setEmail(email);
        buildUserDt0.setPassword(password);
        buildUserDt0.setProfilePic(base64ProfilePic);
        userService.saveUser(buildUserDt0);
        return buildUserDt0;

    }
}
