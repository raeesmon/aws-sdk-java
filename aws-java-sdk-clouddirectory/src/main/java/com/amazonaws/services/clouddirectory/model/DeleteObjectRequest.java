/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/DeleteObject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteObjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the <a>Directory</a> where the object resides. For more
     * information, see <a>arns</a>.
     * </p>
     */
    private String directoryArn;
    /**
     * <p>
     * A reference that identifies the object.
     * </p>
     */
    private ObjectReference objectReference;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the <a>Directory</a> where the object resides. For more
     * information, see <a>arns</a>.
     * </p>
     * 
     * @param directoryArn
     *        The Amazon Resource Name (ARN) that is associated with the <a>Directory</a> where the object resides. For
     *        more information, see <a>arns</a>.
     */

    public void setDirectoryArn(String directoryArn) {
        this.directoryArn = directoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the <a>Directory</a> where the object resides. For more
     * information, see <a>arns</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that is associated with the <a>Directory</a> where the object resides. For
     *         more information, see <a>arns</a>.
     */

    public String getDirectoryArn() {
        return this.directoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the <a>Directory</a> where the object resides. For more
     * information, see <a>arns</a>.
     * </p>
     * 
     * @param directoryArn
     *        The Amazon Resource Name (ARN) that is associated with the <a>Directory</a> where the object resides. For
     *        more information, see <a>arns</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteObjectRequest withDirectoryArn(String directoryArn) {
        setDirectoryArn(directoryArn);
        return this;
    }

    /**
     * <p>
     * A reference that identifies the object.
     * </p>
     * 
     * @param objectReference
     *        A reference that identifies the object.
     */

    public void setObjectReference(ObjectReference objectReference) {
        this.objectReference = objectReference;
    }

    /**
     * <p>
     * A reference that identifies the object.
     * </p>
     * 
     * @return A reference that identifies the object.
     */

    public ObjectReference getObjectReference() {
        return this.objectReference;
    }

    /**
     * <p>
     * A reference that identifies the object.
     * </p>
     * 
     * @param objectReference
     *        A reference that identifies the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteObjectRequest withObjectReference(ObjectReference objectReference) {
        setObjectReference(objectReference);
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
        if (getDirectoryArn() != null)
            sb.append("DirectoryArn: ").append(getDirectoryArn()).append(",");
        if (getObjectReference() != null)
            sb.append("ObjectReference: ").append(getObjectReference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteObjectRequest == false)
            return false;
        DeleteObjectRequest other = (DeleteObjectRequest) obj;
        if (other.getDirectoryArn() == null ^ this.getDirectoryArn() == null)
            return false;
        if (other.getDirectoryArn() != null && other.getDirectoryArn().equals(this.getDirectoryArn()) == false)
            return false;
        if (other.getObjectReference() == null ^ this.getObjectReference() == null)
            return false;
        if (other.getObjectReference() != null && other.getObjectReference().equals(this.getObjectReference()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryArn() == null) ? 0 : getDirectoryArn().hashCode());
        hashCode = prime * hashCode + ((getObjectReference() == null) ? 0 : getObjectReference().hashCode());
        return hashCode;
    }

    @Override
    public DeleteObjectRequest clone() {
        return (DeleteObjectRequest) super.clone();
    }

}
