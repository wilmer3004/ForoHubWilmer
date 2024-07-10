package com.forohub.wilmer.forohubwilmer.Http;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseGet {
    Date timestamp = new Date();
    Integer status;
    String message;
    List<?> data;
}
