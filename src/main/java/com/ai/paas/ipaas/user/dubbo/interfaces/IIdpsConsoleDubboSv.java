package com.ai.paas.ipaas.user.dubbo.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.paas.ipaas.user.dubbo.vo.SelectWithNoPageRequest;
import com.ai.paas.ipaas.user.dubbo.vo.SelectWithNoPageResponse;
import com.ai.paas.ipaas.user.dubbo.vo.UserProdInstVo;
@Path("/idps/console")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
public interface IIdpsConsoleDubboSv {
	/**
	 * 查询用户订购的IDPS产品列表
	 * @param request
	 * @return
	 */
	@Path("/selectUserProdInsts")
	@POST
	public SelectWithNoPageResponse<UserProdInstVo> selectUserProdInsts(SelectWithNoPageRequest<UserProdInstVo> request);
	 
}
