package model;

import java.sql.Blob;
import java.util.List;

public interface AlbumDAO {

	AlbumBean select(String albId);

	List<AlbumBean> select();

	boolean insert(AlbumBean bean);

	boolean update(String albId, Blob photo, Blob resizePic);

	boolean delete(String albId);

}