package com.dailystar.dsacademy.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="courseEnrollment")
public class CourseEnrollment {

    @Id
    private String _id;
    private String enrollment;
    private String category_id;


//    private String name;
//    private String description;
//    private String picture;
//    private String banner;
//    private String contents;
//    private String attachments;
//    private String start;
//    private String end;
//    private String duration;
//    private String price;
//    private String sale_price;
//    private String learner_count;
//    private String certification;
//    private String created;
//    private  String modified;
}
