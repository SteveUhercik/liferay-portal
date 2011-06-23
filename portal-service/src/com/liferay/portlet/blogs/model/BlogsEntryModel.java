/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.blogs.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.model.WorkflowedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the BlogsEntry service. Represents a row in the &quot;BlogsEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.blogs.model.impl.BlogsEntryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portlet.blogs.model.impl.BlogsEntryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BlogsEntry
 * @see com.liferay.portlet.blogs.model.impl.BlogsEntryImpl
 * @see com.liferay.portlet.blogs.model.impl.BlogsEntryModelImpl
 * @generated
 */
public interface BlogsEntryModel extends BaseModel<BlogsEntry>, GroupedModel,
	WorkflowedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a blogs entry model instance should use the {@link BlogsEntry} interface instead.
	 */

	/**
	 * Returns the primary key of this blogs entry.
	 *
	 * @return the primary key of this blogs entry
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this blogs entry.
	 *
	 * @param primaryKey the primary key of this blogs entry
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this blogs entry.
	 *
	 * @return the uuid of this blogs entry
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this blogs entry.
	 *
	 * @param uuid the uuid of this blogs entry
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the entry ID of this blogs entry.
	 *
	 * @return the entry ID of this blogs entry
	 */
	public long getEntryId();

	/**
	 * Sets the entry ID of this blogs entry.
	 *
	 * @param entryId the entry ID of this blogs entry
	 */
	public void setEntryId(long entryId);

	/**
	 * Returns the group ID of this blogs entry.
	 *
	 * @return the group ID of this blogs entry
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this blogs entry.
	 *
	 * @param groupId the group ID of this blogs entry
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this blogs entry.
	 *
	 * @return the company ID of this blogs entry
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this blogs entry.
	 *
	 * @param companyId the company ID of this blogs entry
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this blogs entry.
	 *
	 * @return the user ID of this blogs entry
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this blogs entry.
	 *
	 * @param userId the user ID of this blogs entry
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this blogs entry.
	 *
	 * @return the user uuid of this blogs entry
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this blogs entry.
	 *
	 * @param userUuid the user uuid of this blogs entry
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this blogs entry.
	 *
	 * @return the user name of this blogs entry
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this blogs entry.
	 *
	 * @param userName the user name of this blogs entry
	 */
	public void setUserName(String userName);

	/**
	 * Returns the create date of this blogs entry.
	 *
	 * @return the create date of this blogs entry
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this blogs entry.
	 *
	 * @param createDate the create date of this blogs entry
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this blogs entry.
	 *
	 * @return the modified date of this blogs entry
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this blogs entry.
	 *
	 * @param modifiedDate the modified date of this blogs entry
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the title of this blogs entry.
	 *
	 * @return the title of this blogs entry
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this blogs entry.
	 *
	 * @param title the title of this blogs entry
	 */
	public void setTitle(String title);

	/**
	 * Returns the url title of this blogs entry.
	 *
	 * @return the url title of this blogs entry
	 */
	@AutoEscape
	public String getUrlTitle();

	/**
	 * Sets the url title of this blogs entry.
	 *
	 * @param urlTitle the url title of this blogs entry
	 */
	public void setUrlTitle(String urlTitle);

	/**
	 * Returns the description of this blogs entry.
	 *
	 * @return the description of this blogs entry
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this blogs entry.
	 *
	 * @param description the description of this blogs entry
	 */
	public void setDescription(String description);

	/**
	 * Returns the content of this blogs entry.
	 *
	 * @return the content of this blogs entry
	 */
	@AutoEscape
	public String getContent();

	/**
	 * Sets the content of this blogs entry.
	 *
	 * @param content the content of this blogs entry
	 */
	public void setContent(String content);

	/**
	 * Returns the display date of this blogs entry.
	 *
	 * @return the display date of this blogs entry
	 */
	public Date getDisplayDate();

	/**
	 * Sets the display date of this blogs entry.
	 *
	 * @param displayDate the display date of this blogs entry
	 */
	public void setDisplayDate(Date displayDate);

	/**
	 * Returns the allow pingbacks of this blogs entry.
	 *
	 * @return the allow pingbacks of this blogs entry
	 */
	public boolean getAllowPingbacks();

	/**
	 * Returns <code>true</code> if this blogs entry is allow pingbacks.
	 *
	 * @return <code>true</code> if this blogs entry is allow pingbacks; <code>false</code> otherwise
	 */
	public boolean isAllowPingbacks();

	/**
	 * Sets whether this blogs entry is allow pingbacks.
	 *
	 * @param allowPingbacks the allow pingbacks of this blogs entry
	 */
	public void setAllowPingbacks(boolean allowPingbacks);

	/**
	 * Returns the allow trackbacks of this blogs entry.
	 *
	 * @return the allow trackbacks of this blogs entry
	 */
	public boolean getAllowTrackbacks();

	/**
	 * Returns <code>true</code> if this blogs entry is allow trackbacks.
	 *
	 * @return <code>true</code> if this blogs entry is allow trackbacks; <code>false</code> otherwise
	 */
	public boolean isAllowTrackbacks();

	/**
	 * Sets whether this blogs entry is allow trackbacks.
	 *
	 * @param allowTrackbacks the allow trackbacks of this blogs entry
	 */
	public void setAllowTrackbacks(boolean allowTrackbacks);

	/**
	 * Returns the trackbacks of this blogs entry.
	 *
	 * @return the trackbacks of this blogs entry
	 */
	@AutoEscape
	public String getTrackbacks();

	/**
	 * Sets the trackbacks of this blogs entry.
	 *
	 * @param trackbacks the trackbacks of this blogs entry
	 */
	public void setTrackbacks(String trackbacks);

	/**
	 * Returns the small image of this blogs entry.
	 *
	 * @return the small image of this blogs entry
	 */
	public boolean getSmallImage();

	/**
	 * Returns <code>true</code> if this blogs entry is small image.
	 *
	 * @return <code>true</code> if this blogs entry is small image; <code>false</code> otherwise
	 */
	public boolean isSmallImage();

	/**
	 * Sets whether this blogs entry is small image.
	 *
	 * @param smallImage the small image of this blogs entry
	 */
	public void setSmallImage(boolean smallImage);

	/**
	 * Returns the small image ID of this blogs entry.
	 *
	 * @return the small image ID of this blogs entry
	 */
	public long getSmallImageId();

	/**
	 * Sets the small image ID of this blogs entry.
	 *
	 * @param smallImageId the small image ID of this blogs entry
	 */
	public void setSmallImageId(long smallImageId);

	/**
	 * Returns the small image u r l of this blogs entry.
	 *
	 * @return the small image u r l of this blogs entry
	 */
	@AutoEscape
	public String getSmallImageURL();

	/**
	 * Sets the small image u r l of this blogs entry.
	 *
	 * @param smallImageURL the small image u r l of this blogs entry
	 */
	public void setSmallImageURL(String smallImageURL);

	/**
	 * Returns the status of this blogs entry.
	 *
	 * @return the status of this blogs entry
	 */
	public int getStatus();

	/**
	 * Sets the status of this blogs entry.
	 *
	 * @param status the status of this blogs entry
	 */
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this blogs entry.
	 *
	 * @return the status by user ID of this blogs entry
	 */
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this blogs entry.
	 *
	 * @param statusByUserId the status by user ID of this blogs entry
	 */
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this blogs entry.
	 *
	 * @return the status by user uuid of this blogs entry
	 * @throws SystemException if a system exception occurred
	 */
	public String getStatusByUserUuid() throws SystemException;

	/**
	 * Sets the status by user uuid of this blogs entry.
	 *
	 * @param statusByUserUuid the status by user uuid of this blogs entry
	 */
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this blogs entry.
	 *
	 * @return the status by user name of this blogs entry
	 */
	@AutoEscape
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this blogs entry.
	 *
	 * @param statusByUserName the status by user name of this blogs entry
	 */
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this blogs entry.
	 *
	 * @return the status date of this blogs entry
	 */
	public Date getStatusDate();

	/**
	 * Sets the status date of this blogs entry.
	 *
	 * @param statusDate the status date of this blogs entry
	 */
	public void setStatusDate(Date statusDate);

	/**
	 * @deprecated Renamed to {@link #isApproved()}
	 */
	public boolean getApproved();

	/**
	 * Returns <code>true</code> if this blogs entry is approved.
	 *
	 * @return <code>true</code> if this blogs entry is approved; <code>false</code> otherwise
	 */
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this blogs entry is a draft.
	 *
	 * @return <code>true</code> if this blogs entry is a draft; <code>false</code> otherwise
	 */
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this blogs entry is expired.
	 *
	 * @return <code>true</code> if this blogs entry is expired; <code>false</code> otherwise
	 */
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this blogs entry is pending.
	 *
	 * @return <code>true</code> if this blogs entry is pending; <code>false</code> otherwise
	 */
	public boolean isPending();

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(BlogsEntry blogsEntry);

	public int hashCode();

	public BlogsEntry toEscapedModel();

	public String toString();

	public String toXmlString();
}