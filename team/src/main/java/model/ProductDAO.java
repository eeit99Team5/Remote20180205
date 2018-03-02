package model;

import java.sql.Blob;
import java.util.List;

public interface ProductDAO {

	ProductBean select(Integer prodId);

	List<ProductBean> select();

	boolean insert(ProductBean bean);

	boolean update(Integer prodId, String prodName, String prodCon, Blob prodPic, Integer price);

	boolean delete(Integer prodId);

}