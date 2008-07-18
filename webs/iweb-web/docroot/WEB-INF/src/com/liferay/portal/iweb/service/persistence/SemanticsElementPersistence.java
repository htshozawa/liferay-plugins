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

package com.liferay.portal.iweb.service.persistence;

/**
 * <a href="SemanticsElementPersistence.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public interface SemanticsElementPersistence {
	public com.liferay.portal.iweb.model.SemanticsElement create(
		java.lang.String elementURI);

	public com.liferay.portal.iweb.model.SemanticsElement remove(
		java.lang.String elementURI)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.iweb.NoSuchSemanticsElementException;

	public com.liferay.portal.iweb.model.SemanticsElement remove(
		com.liferay.portal.iweb.model.SemanticsElement semanticsElement)
		throws com.liferay.portal.SystemException;

	public com.liferay.portal.iweb.model.SemanticsElement update(
		com.liferay.portal.iweb.model.SemanticsElement semanticsElement)
		throws com.liferay.portal.SystemException;

	public com.liferay.portal.iweb.model.SemanticsElement update(
		com.liferay.portal.iweb.model.SemanticsElement semanticsElement,
		boolean merge) throws com.liferay.portal.SystemException;

	public com.liferay.portal.iweb.model.SemanticsElement updateImpl(
		com.liferay.portal.iweb.model.SemanticsElement semanticsElement,
		boolean merge) throws com.liferay.portal.SystemException;

	public com.liferay.portal.iweb.model.SemanticsElement findByPrimaryKey(
		java.lang.String elementURI)
		throws com.liferay.portal.SystemException,
			com.liferay.portal.iweb.NoSuchSemanticsElementException;

	public com.liferay.portal.iweb.model.SemanticsElement fetchByPrimaryKey(
		java.lang.String elementURI) throws com.liferay.portal.SystemException;

	public java.util.List<Object> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.SystemException;

	public java.util.List<Object> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.portal.iweb.model.SemanticsElement> findAll()
		throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.portal.iweb.model.SemanticsElement> findAll(
		int start, int end) throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.portal.iweb.model.SemanticsElement> findAll(
		int start, int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException;

	public void removeAll() throws com.liferay.portal.SystemException;

	public int countAll() throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.portal.iweb.model.Post> getPosts(
		java.lang.String pk) throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.portal.iweb.model.Post> getPosts(
		java.lang.String pk, int start, int end)
		throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.portal.iweb.model.Post> getPosts(
		java.lang.String pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException;

	public int getPostsSize(java.lang.String pk)
		throws com.liferay.portal.SystemException;

	public boolean containsPost(java.lang.String pk, long postPK)
		throws com.liferay.portal.SystemException;

	public boolean containsPosts(java.lang.String pk)
		throws com.liferay.portal.SystemException;

	public void addPost(java.lang.String pk, long postPK)
		throws com.liferay.portal.SystemException;

	public void addPost(java.lang.String pk,
		com.liferay.portal.iweb.model.Post post)
		throws com.liferay.portal.SystemException;

	public void addPosts(java.lang.String pk, long[] postPKs)
		throws com.liferay.portal.SystemException;

	public void addPosts(java.lang.String pk,
		java.util.List<com.liferay.portal.iweb.model.Post> posts)
		throws com.liferay.portal.SystemException;

	public void clearPosts(java.lang.String pk)
		throws com.liferay.portal.SystemException;

	public void removePost(java.lang.String pk, long postPK)
		throws com.liferay.portal.SystemException;

	public void removePost(java.lang.String pk,
		com.liferay.portal.iweb.model.Post post)
		throws com.liferay.portal.SystemException;

	public void removePosts(java.lang.String pk, long[] postPKs)
		throws com.liferay.portal.SystemException;

	public void removePosts(java.lang.String pk,
		java.util.List<com.liferay.portal.iweb.model.Post> posts)
		throws com.liferay.portal.SystemException;

	public void setPosts(java.lang.String pk, long[] postPKs)
		throws com.liferay.portal.SystemException;

	public void setPosts(java.lang.String pk,
		java.util.List<com.liferay.portal.iweb.model.Post> posts)
		throws com.liferay.portal.SystemException;

	public void registerListener(
		com.liferay.portal.model.ModelListener listener);

	public void unregisterListener(
		com.liferay.portal.model.ModelListener listener);
}