package com.exm.model.user.modeluser.VO;

import com.exm.model.user.modeluser.model.Department;
import com.exm.model.user.modeluser.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplate {

    private User user;
    private Department department;
}
