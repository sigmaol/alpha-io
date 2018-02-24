package org.ko.prototype.data.constants.domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 此文件由工具生成，请勿修改
 * 生成时间: 2018-02-24 11:26:44
 * 
 */
public final class MenuConstants {

	public static final class Values {
		public static final class Visible {
			public static final short Hidden = 0;			// 不可见
			public static final short Display = 1;			// 可见
			public static String convert(Short value){
				String text = String.valueOf(value);
				if(Short.valueOf(Hidden).equals(value)){
					text = "不可见";
				}else if(Short.valueOf(Display).equals(value)){
					text = "可见";
				}
				return text;
			}
			public static Short convert(String text){
				Short value = null;
				if("不可见".equals(text)){
					value = Hidden;
				}else if("可见".equals(text)){
					value = Display;
				}
				return value;
			}
		}
		public static final class DeleteStatus {
			public static final short Deleted = 0;			// 删除
			public static final short Available = 1;			// 有效
			public static String convert(Short value){
				String text = String.valueOf(value);
				if(Short.valueOf(Deleted).equals(value)){
					text = "删除";
				}else if(Short.valueOf(Available).equals(value)){
					text = "有效";
				}
				return text;
			}
			public static Short convert(String text){
				Short value = null;
				if("删除".equals(text)){
					value = Deleted;
				}else if("有效".equals(text)){
					value = Available;
				}
				return value;
			}
		}
		public static Object serialize(String columnName, String text){
			if(Columns.VISIBLE.equalsIgnoreCase(columnName)){
				return Visible.convert(text);
			}
			if(Columns.DELETE_STATUS.equalsIgnoreCase(columnName)){
				return DeleteStatus.convert(text);
			}
			return text;
		}
		public static Object deserialize(String columnName, Short value){
			if(Columns.VISIBLE.equalsIgnoreCase(columnName)){
				return Visible.convert(value);
			}
			if(Columns.DELETE_STATUS.equalsIgnoreCase(columnName)){
				return DeleteStatus.convert(value);
			}
			return value;
		}
	}
		
	public static final class Columns {
		public static final String ID = "id";
		public static final String PARENT_ID = "parent_id";
		public static final String NAME = "name";
		public static final String URL = "url";
		public static final String ICON_CSS = "icon_css";
		public static final String VISIBLE = "visible";
		public static final String DELETE_STATUS = "delete_status";
		public static final String SORT = "sort";
		public static final String TRACE_CODE_I = "trace_code_i";
		public static final String TRACE_CODE_U = "trace_code_u";
		public static final String HOST_NAME = "host_name";
		public static final String CREATE_USER_ID = "create_user_id";
		public static final String CREATE_BY = "create_by";
		public static final String CREATE_DATE = "create_date";
		public static final String UPDATE_USER_ID = "update_user_id";
		public static final String UPDATE_BY = "update_by";
		public static final String UPDATE_DATE = "update_date";

		public static final List<String> COLUMNS = Arrays.asList(new String[]{
			ID.toLowerCase()
			, PARENT_ID.toLowerCase()
			, NAME.toLowerCase()
			, URL.toLowerCase()
			, ICON_CSS.toLowerCase()
			, VISIBLE.toLowerCase()
			, DELETE_STATUS.toLowerCase()
			, SORT.toLowerCase()
			, TRACE_CODE_I.toLowerCase()
			, TRACE_CODE_U.toLowerCase()
			, HOST_NAME.toLowerCase()
			, CREATE_USER_ID.toLowerCase()
			, CREATE_BY.toLowerCase()
			, CREATE_DATE.toLowerCase()
			, UPDATE_USER_ID.toLowerCase()
			, UPDATE_BY.toLowerCase()
			, UPDATE_DATE.toLowerCase()
		});
		
		public static final Map<String, String> FIELDS;
		
		static{
			Map<String, String> fieldMap = new HashMap<>();
			fieldMap.put(ID, "id");
			fieldMap.put(PARENT_ID, "parentId");
			fieldMap.put(NAME, "name");
			fieldMap.put(URL, "url");
			fieldMap.put(ICON_CSS, "iconCss");
			fieldMap.put(VISIBLE, "visible");
			fieldMap.put(DELETE_STATUS, "deleteStatus");
			fieldMap.put(SORT, "sort");
			fieldMap.put(TRACE_CODE_I, "traceCodeI");
			fieldMap.put(TRACE_CODE_U, "traceCodeU");
			fieldMap.put(HOST_NAME, "hostName");
			fieldMap.put(CREATE_USER_ID, "createUserId");
			fieldMap.put(CREATE_BY, "createBy");
			fieldMap.put(CREATE_DATE, "createDate");
			fieldMap.put(UPDATE_USER_ID, "updateUserId");
			fieldMap.put(UPDATE_BY, "updateBy");
			fieldMap.put(UPDATE_DATE, "updateDate");
			FIELDS = Collections.unmodifiableMap(fieldMap);
		}
		
		public static final List<String> AUDIT_COLUMNS = Arrays.asList(new String[]{
			"delete_status"
			, "tx_code"
			, "create_user_id"
			, "create_by"
			, "create_date"
			, "update_user_id"
			, "update_by"
			, "update_date"
		});
		
		public static boolean contains(String columnName){
			return columnName != null ? COLUMNS.contains(columnName.toLowerCase()) : false;
		}
	}
	
	private MenuConstants(){}
}
