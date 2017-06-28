/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListTagOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagOptionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The resulting detailed TagOption information.
     * </p>
     */
    private java.util.List<TagOptionDetail> tagOptionDetails;
    /**
     * <p>
     * The page token of the first page retrieved. If null, this retrieves the first page of size <code>PageSize</code>.
     * </p>
     */
    private String pageToken;

    /**
     * <p>
     * The resulting detailed TagOption information.
     * </p>
     * 
     * @return The resulting detailed TagOption information.
     */

    public java.util.List<TagOptionDetail> getTagOptionDetails() {
        return tagOptionDetails;
    }

    /**
     * <p>
     * The resulting detailed TagOption information.
     * </p>
     * 
     * @param tagOptionDetails
     *        The resulting detailed TagOption information.
     */

    public void setTagOptionDetails(java.util.Collection<TagOptionDetail> tagOptionDetails) {
        if (tagOptionDetails == null) {
            this.tagOptionDetails = null;
            return;
        }

        this.tagOptionDetails = new java.util.ArrayList<TagOptionDetail>(tagOptionDetails);
    }

    /**
     * <p>
     * The resulting detailed TagOption information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagOptionDetails(java.util.Collection)} or {@link #withTagOptionDetails(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param tagOptionDetails
     *        The resulting detailed TagOption information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagOptionsResult withTagOptionDetails(TagOptionDetail... tagOptionDetails) {
        if (this.tagOptionDetails == null) {
            setTagOptionDetails(new java.util.ArrayList<TagOptionDetail>(tagOptionDetails.length));
        }
        for (TagOptionDetail ele : tagOptionDetails) {
            this.tagOptionDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resulting detailed TagOption information.
     * </p>
     * 
     * @param tagOptionDetails
     *        The resulting detailed TagOption information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagOptionsResult withTagOptionDetails(java.util.Collection<TagOptionDetail> tagOptionDetails) {
        setTagOptionDetails(tagOptionDetails);
        return this;
    }

    /**
     * <p>
     * The page token of the first page retrieved. If null, this retrieves the first page of size <code>PageSize</code>.
     * </p>
     * 
     * @param pageToken
     *        The page token of the first page retrieved. If null, this retrieves the first page of size
     *        <code>PageSize</code>.
     */

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    /**
     * <p>
     * The page token of the first page retrieved. If null, this retrieves the first page of size <code>PageSize</code>.
     * </p>
     * 
     * @return The page token of the first page retrieved. If null, this retrieves the first page of size
     *         <code>PageSize</code>.
     */

    public String getPageToken() {
        return this.pageToken;
    }

    /**
     * <p>
     * The page token of the first page retrieved. If null, this retrieves the first page of size <code>PageSize</code>.
     * </p>
     * 
     * @param pageToken
     *        The page token of the first page retrieved. If null, this retrieves the first page of size
     *        <code>PageSize</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagOptionsResult withPageToken(String pageToken) {
        setPageToken(pageToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTagOptionDetails() != null)
            sb.append("TagOptionDetails: ").append(getTagOptionDetails()).append(",");
        if (getPageToken() != null)
            sb.append("PageToken: ").append(getPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTagOptionsResult == false)
            return false;
        ListTagOptionsResult other = (ListTagOptionsResult) obj;
        if (other.getTagOptionDetails() == null ^ this.getTagOptionDetails() == null)
            return false;
        if (other.getTagOptionDetails() != null && other.getTagOptionDetails().equals(this.getTagOptionDetails()) == false)
            return false;
        if (other.getPageToken() == null ^ this.getPageToken() == null)
            return false;
        if (other.getPageToken() != null && other.getPageToken().equals(this.getPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTagOptionDetails() == null) ? 0 : getTagOptionDetails().hashCode());
        hashCode = prime * hashCode + ((getPageToken() == null) ? 0 : getPageToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTagOptionsResult clone() {
        try {
            return (ListTagOptionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
