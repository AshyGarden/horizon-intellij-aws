package com.spring.jpa.api.newsapi.entity;

import lombok.*;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Getter @Setter @ToString
@EqualsAndHashCode
@NoArgsConstructor @AllArgsConstructor
@Builder @Entity
@Table(name = "news")
public class News {


}
