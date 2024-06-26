package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.Doucement.Tourist;
import com.nt.repo.TouristRepo;
@Service("touristmgmt")
public class TouristMgmtServiceImpl implements ITouristMgmtService {
	@Autowired
	private TouristRepo touristrepo;

	@Override
	public String registerTourist(Tourist tourist) {
		
		return "Document is savd with id value::"+touristrepo.insert(tourist).getId();
	}

	@Override
	public List<Tourist> fetchAllTourists(boolean asc,String ... properties) {
		Sort sort = Sort.by(asc?Direction.DESC:Direction.ASC,properties);
		return touristrepo.findAll(sort);
	}
//--------------------------------------------------------------------------------
	@Override
	public Optional<Tourist> fetchTouristById(String id) {
		Optional<Tourist> opt =touristrepo.findById(id);
		return opt;
	}
//-------------------------update--------------------------------------
	@Override
	public String modifyTouristById(String id, String touristnam, String nativePlace) {
		Optional<Tourist> opt = touristrepo.findById(id);
		if(opt.isPresent()) {
			Tourist tourist = opt.get()	;
			tourist.setTouristName(touristnam);
			tourist.setNativePlace(nativePlace);
			return touristrepo.save(tourist).getId()+"is updated with new name";
			}
		else
			return "Document is not found";
	}
//----------------------------delect-----------------
	@Override
	public String removeTouristById(String id) {
	Optional<Tourist> opt = touristrepo.findById(id);
	if(opt.isPresent()) {
		Tourist tourist = opt.get();
	touristrepo.delete(tourist);
	return "Document is found and delected";
	}
	else {
		return "Document is not found";
	}
}

}