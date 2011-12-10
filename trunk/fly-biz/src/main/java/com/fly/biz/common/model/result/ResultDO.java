package com.fly.biz.common.model.result;

import java.util.HashSet;
import java.util.Set;



public class ResultDO<T>{
	
	private boolean success = true; // ִ���Ƿ�ɹ�
	protected Set<String> errors;
	private T module; // ʵ�ʵķ��ؽ��
	
	
	/**
	 * ������Ϣ
	 */
	private String errMsg;


	public ResultDO() {
	}

	public ResultDO(T module) {
		this.module = module;
	}
	
	public static <T> ResultDO<T> getResult(){
		return new ResultDO<T>();
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	
	public T getModule() {
		return module;
	}

	public void setModule(T module) {
		this.module = module;
	}

	/**
	 * ����һ��result��
	 * 
	 * @param success
	 * �Ƿ�ɹ�
	 */
	public ResultDO(boolean success) {
		this.success = success;
	}

	public boolean isSuccess() {
		return success;
	}

	public boolean isFailure() {
		return !success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Set<String> getErrors() {
		if (null == errors) {
			errors = new HashSet<String>();
		}
		return errors;
	}

	public void setErrors(Set<String> errors) {
		this.errors = errors;
	}

	public String getErrorStr() {
		if (this.errors == null || this.errors.isEmpty())
			return null;
		StringBuilder sb = new StringBuilder();
		for (Object e : this.errors) {
			sb.append(e);
			sb.append(",");
		}
		if (sb.length() > 0)
			sb.deleteCharAt(sb.length() - 1);
		return sb.toString();
	}

	public void addErrors(Set<String> errors) {
		if (this.errors == null) {
			this.errors = new HashSet<String>();
		}
		this.errors.addAll(errors);
		if (errors.size() > 0) {
			success = false; // ָʾ��֤ʧ��
		}
	}

	/**
	 * @param error
	 * ������Ϣ, Ҳ��Ϊ������
	 * @return true ��ʾ�д���, false��ʾ�޴���
	 */
	public boolean addError(String error) {
		if (error.isEmpty()) {
			return success;
		}

		if (errors == null) {
			errors = new HashSet<String>();
		}
		errors.add(error);

		success = false; // ָʾ��֤ʧ��

		return success;
	}

}
