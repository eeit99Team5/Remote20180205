package model;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT")
public class ProductBean {
private Integer prodId;
private String prodName;
private String prodCon;
private Blob prodPic;
private Integer price;
@Override
public String toString() {
	return "productBean [prodId=" + prodId + ", prodName=" + prodName + ", prodCon=" + prodCon + ", prodPic=" + prodPic
			+ ", price=" + price + "]";
}
public Integer getProdId() {
	return prodId;
}
public void setProdId(Integer prodId) {
	this.prodId = prodId;
}
public String getProdName() {
	return prodName;
}
public void setProdName(String prodName) {
	this.prodName = prodName;
}
public String getProdCon() {
	return prodCon;
}
public void setProdCon(String prodCon) {
	this.prodCon = prodCon;
}
public Blob getProdPic() {
	return prodPic;
}
public void setProdPic(Blob prodPic) {
	this.prodPic = prodPic;
}
public Integer getPrice() {
	return price;
}
public void setPrice(Integer price) {
	this.price = price;
}

}
