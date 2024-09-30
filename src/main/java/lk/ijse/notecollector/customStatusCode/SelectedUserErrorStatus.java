package lk.ijse.notecollector.customStatusCode;

import lk.ijse.notecollector.dto.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class SelectedUserErrorStatus implements UserStatus {
    private int statusCode;
    private String statusMessage;
}
