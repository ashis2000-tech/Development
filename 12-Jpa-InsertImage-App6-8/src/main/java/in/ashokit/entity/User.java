package in.ashokit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="USER_TBL")
@Data
public class User {
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE)
@Column(name="USER-ID")
private Integer userId;
@Column(name="USER-NAME")
private String userName;
@Column(name="USER-EMAIL")
private String userEmail;
@Column(name="USER-IMAGE")
@Lob
private byte[] userImage;
}
