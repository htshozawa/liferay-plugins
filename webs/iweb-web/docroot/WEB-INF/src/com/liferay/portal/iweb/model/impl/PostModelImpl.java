/**
 * Copyright (c) 2000-2008 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portal.iweb.model.impl;

import com.liferay.portal.iweb.model.Post;
import com.liferay.portal.iweb.model.PostSoap;
import com.liferay.portal.kernel.bean.ReadOnlyBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="PostModelImpl.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public class PostModelImpl extends BaseModelImpl {
	public static final String TABLE_NAME = "IWEB_Post";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uid", new Integer(Types.BIGINT) },
			

			{ "pid", new Integer(Types.BIGINT) },
			

			{ "type_", new Integer(Types.VARCHAR) },
			

			{ "communityid", new Integer(Types.BIGINT) }
		};
	public static final String TABLE_SQL_CREATE = "create table IWEB_Post (uid LONG not null primary key,pid LONG,type_ VARCHAR(75) null,communityid LONG)";
	public static final String TABLE_SQL_DROP = "drop table IWEB_Post";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.portal.iweb.model.Post"),
			true);

	public static Post toModel(PostSoap soapModel) {
		Post model = new PostImpl();

		model.setUid(soapModel.getUid());
		model.setPid(soapModel.getPid());
		model.setType(soapModel.getType());
		model.setCommunityid(soapModel.getCommunityid());

		return model;
	}

	public static List<Post> toModels(PostSoap[] soapModels) {
		List<Post> models = new ArrayList<Post>(soapModels.length);

		for (PostSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final boolean CACHE_ENABLED_POSTS_SEMANTICSELEMENTS = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.Posts_SemanticsElements"),
			true);
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.portal.iweb.model.Post"));

	public PostModelImpl() {
	}

	public long getPrimaryKey() {
		return _uid;
	}

	public void setPrimaryKey(long pk) {
		setUid(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_uid);
	}

	public long getUid() {
		return _uid;
	}

	public void setUid(long uid) {
		if (uid != _uid) {
			_uid = uid;
		}
	}

	public long getPid() {
		return _pid;
	}

	public void setPid(long pid) {
		if (pid != _pid) {
			_pid = pid;
		}
	}

	public String getType() {
		return GetterUtil.getString(_type);
	}

	public void setType(String type) {
		if (((type == null) && (_type != null)) ||
				((type != null) && (_type == null)) ||
				((type != null) && (_type != null) && !type.equals(_type))) {
			_type = type;
		}
	}

	public long getCommunityid() {
		return _communityid;
	}

	public void setCommunityid(long communityid) {
		if (communityid != _communityid) {
			_communityid = communityid;
		}
	}

	public Post toEscapedModel() {
		if (isEscapedModel()) {
			return (Post)this;
		}
		else {
			Post model = new PostImpl();

			model.setEscapedModel(true);

			model.setUid(getUid());
			model.setPid(getPid());
			model.setType(HtmlUtil.escape(getType()));
			model.setCommunityid(getCommunityid());

			model = (Post)Proxy.newProxyInstance(Post.class.getClassLoader(),
					new Class[] { Post.class }, new ReadOnlyBeanHandler(model));

			return model;
		}
	}

	public Object clone() {
		PostImpl clone = new PostImpl();

		clone.setUid(getUid());
		clone.setPid(getPid());
		clone.setType(getType());
		clone.setCommunityid(getCommunityid());

		return clone;
	}

	public int compareTo(Object obj) {
		if (obj == null) {
			return -1;
		}

		PostImpl post = (PostImpl)obj;

		long pk = post.getPrimaryKey();

		if (getPrimaryKey() < pk) {
			return -1;
		}
		else if (getPrimaryKey() > pk) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		PostImpl post = null;

		try {
			post = (PostImpl)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = post.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	private long _uid;
	private long _pid;
	private String _type;
	private long _communityid;
}