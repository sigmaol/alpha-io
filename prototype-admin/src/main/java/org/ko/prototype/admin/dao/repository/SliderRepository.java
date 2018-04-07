package org.ko.prototype.admin.dao.repository;

import java.util.List;

import org.ko.prototype.core.repository.GenericRepository;
import org.ko.prototype.data.master.dao.mapper.SliderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.ko.prototype.data.master.domain.bean.Slider;
import org.ko.prototype.data.master.domain.bean.SliderExample;
import org.ko.prototype.data.master.domain.constants.SliderConstants;

/**
 * 此文件初版由工具生成，请定制开发
 * 生成时间: 2018-02-24 13:12:21
 * 
 */
@Repository
public class SliderRepository extends GenericRepository<Slider, SliderExample> {

	private static final Short AVAILABLE_VALUE = SliderConstants.Values.DeleteStatus.Available;
	
	@Autowired private SliderMapper mapper;

	public List<Slider> findAllAvailable(){
		SliderExample e = new SliderExample();
		e.createCriteria().andDeleteStatusEqualTo(AVAILABLE_VALUE);
		return mapper.selectByExample(e);
	}

	public Slider findAvailableById(Integer id){
		Slider record = super.findById(id);
		return Short.valueOf(SliderConstants.Values.DeleteStatus.Available).equals(record.getDeleteStatus()) ? record : null;
	}
	
	public int markDelete(Integer id){
		SliderExample e = new SliderExample();
		e.createCriteria().andDeleteStatusEqualTo(AVAILABLE_VALUE);
		Slider record = new Slider();
		record.setId(id);
		record.setDeleteStatus(SliderConstants.Values.DeleteStatus.Deleted);
		return mapper.updateByPrimaryKeySelective(record);
	}
}