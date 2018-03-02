package model;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ALBUM")
public class AlbumBean {
@Id
private String albId;
private Blob photo;	
private Blob resizePic;
@Override
public String toString() {
	return "AlbumBean [albId=" + albId + ", photo=" + photo + ", resizePic=" + resizePic + "]";
}
public String getAlbId() {
	return albId;
}
public void setAlbId(String albId) {
	this.albId = albId;
}
public Blob getPhoto() {
	return photo;
}
public void setPhoto(Blob photo) {
	this.photo = photo;
}
public Blob getResizePic() {
	return resizePic;
}
public void setResizePic(Blob resizePic) {
	this.resizePic = resizePic;
}	

}
