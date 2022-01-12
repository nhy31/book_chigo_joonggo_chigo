package com.bookchigo.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.bookchigo.domain.GpApply;
import com.bookchigo.domain.GroupPurchase;
// test22
public interface GroupPurchaseDao {
	
	// 由ъ뒪�듃 遺덈윭�삤�뒗嫄�
	List<GroupPurchase> getGroupPurchaseList() throws DataAccessException;
	List<GroupPurchase> getGroupPurchaseImReaderList(int readerMemberId) throws DataAccessException;
	List<GroupPurchase> Search_GroupPurchase(String book_name) throws DataAccessException; 
	List<GpApply> getWhoApplierList(int gp_postId) throws DataAccessException;
	List<GpApply> getMyApplyList(int memberId) throws DataAccessException;

	// get (�뼸�뼱�삤�뒗 �옉�뾽 愿��젴)
	GroupPurchase getGpPostByPostId (int gp_postId) throws DataAccessException;

	// 寃뚯떆湲� �뾽濡쒕뱶�� �궘�젣
	GroupPurchase Upload_GroupPurchase(GroupPurchase newPost) throws DataAccessException;
	void Delete_GroupPurchase(int gp_postId) throws DataAccessException;
	GroupPurchase Update_GroupPurchase(GroupPurchase Post) throws DataAccessException;
	
	// �옄�꽭�엳蹂닿린
	GroupPurchase Detail_GroupPurchase(int gp_postId) throws DataAccessException;

	// 怨듦뎄 �떊泥�&痍⑥냼
	void Apply_GroupPurchase(int gp_postId) throws DataAccessException; 
	void Cancel_GroupPurchase(int gp_postId) throws DataAccessException; 
	
	// 怨듦뎄�떊泥�痍⑥냼 -> �뵒鍮꾩뿉 �궫�엯�궘�젣, �떊泥�紐⑸줉�뿉 �궫�엯�궘�젣
	void insertGpApply(GpApply newApply) throws DataAccessException; 
	void deleteGpApply(GpApply delApply) throws DataAccessException; 
	
	// ing 泥댄겕 諛� UPDATE
	void ingUpdate(int gp_postId) throws DataAccessException; 
	
}
