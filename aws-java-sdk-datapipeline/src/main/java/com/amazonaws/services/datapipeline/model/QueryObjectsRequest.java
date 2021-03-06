/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.datapipeline.DataPipeline#queryObjects(QueryObjectsRequest) QueryObjects operation}.
 * <p>
 * Queries the specified pipeline for the names of objects that match the
 * specified set of conditions.
 * </p>
 *
 * @see com.amazonaws.services.datapipeline.DataPipeline#queryObjects(QueryObjectsRequest)
 */
public class QueryObjectsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The ID of the pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String pipelineId;

    /**
     * The query that defines the objects to be returned. The
     * <code>Query</code> object can contain a maximum of ten selectors. The
     * conditions in the query are limited to top-level String fields in the
     * object. These filters can be applied to components, instances, and
     * attempts.
     */
    private Query query;

    /**
     * Indicates whether the query applies to components or instances. The
     * possible values are: <code>COMPONENT</code>, <code>INSTANCE</code>,
     * and <code>ATTEMPT</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String sphere;

    /**
     * The starting point for the results to be returned. For the first call,
     * this value should be empty. As long as there are more results,
     * continue to call <code>QueryObjects</code> with the marker value from
     * the previous call to retrieve the next set of results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String marker;

    /**
     * The maximum number of object names that <code>QueryObjects</code> will
     * return in a single call. The default value is 100.
     */
    private Integer limit;

    /**
     * The ID of the pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The ID of the pipeline.
     */
    public String getPipelineId() {
        return pipelineId;
    }
    
    /**
     * The ID of the pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param pipelineId The ID of the pipeline.
     */
    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }
    
    /**
     * The ID of the pipeline.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param pipelineId The ID of the pipeline.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public QueryObjectsRequest withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
     * The query that defines the objects to be returned. The
     * <code>Query</code> object can contain a maximum of ten selectors. The
     * conditions in the query are limited to top-level String fields in the
     * object. These filters can be applied to components, instances, and
     * attempts.
     *
     * @return The query that defines the objects to be returned. The
     *         <code>Query</code> object can contain a maximum of ten selectors. The
     *         conditions in the query are limited to top-level String fields in the
     *         object. These filters can be applied to components, instances, and
     *         attempts.
     */
    public Query getQuery() {
        return query;
    }
    
    /**
     * The query that defines the objects to be returned. The
     * <code>Query</code> object can contain a maximum of ten selectors. The
     * conditions in the query are limited to top-level String fields in the
     * object. These filters can be applied to components, instances, and
     * attempts.
     *
     * @param query The query that defines the objects to be returned. The
     *         <code>Query</code> object can contain a maximum of ten selectors. The
     *         conditions in the query are limited to top-level String fields in the
     *         object. These filters can be applied to components, instances, and
     *         attempts.
     */
    public void setQuery(Query query) {
        this.query = query;
    }
    
    /**
     * The query that defines the objects to be returned. The
     * <code>Query</code> object can contain a maximum of ten selectors. The
     * conditions in the query are limited to top-level String fields in the
     * object. These filters can be applied to components, instances, and
     * attempts.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param query The query that defines the objects to be returned. The
     *         <code>Query</code> object can contain a maximum of ten selectors. The
     *         conditions in the query are limited to top-level String fields in the
     *         object. These filters can be applied to components, instances, and
     *         attempts.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public QueryObjectsRequest withQuery(Query query) {
        this.query = query;
        return this;
    }

    /**
     * Indicates whether the query applies to components or instances. The
     * possible values are: <code>COMPONENT</code>, <code>INSTANCE</code>,
     * and <code>ATTEMPT</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return Indicates whether the query applies to components or instances. The
     *         possible values are: <code>COMPONENT</code>, <code>INSTANCE</code>,
     *         and <code>ATTEMPT</code>.
     */
    public String getSphere() {
        return sphere;
    }
    
    /**
     * Indicates whether the query applies to components or instances. The
     * possible values are: <code>COMPONENT</code>, <code>INSTANCE</code>,
     * and <code>ATTEMPT</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param sphere Indicates whether the query applies to components or instances. The
     *         possible values are: <code>COMPONENT</code>, <code>INSTANCE</code>,
     *         and <code>ATTEMPT</code>.
     */
    public void setSphere(String sphere) {
        this.sphere = sphere;
    }
    
    /**
     * Indicates whether the query applies to components or instances. The
     * possible values are: <code>COMPONENT</code>, <code>INSTANCE</code>,
     * and <code>ATTEMPT</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param sphere Indicates whether the query applies to components or instances. The
     *         possible values are: <code>COMPONENT</code>, <code>INSTANCE</code>,
     *         and <code>ATTEMPT</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public QueryObjectsRequest withSphere(String sphere) {
        this.sphere = sphere;
        return this;
    }

    /**
     * The starting point for the results to be returned. For the first call,
     * this value should be empty. As long as there are more results,
     * continue to call <code>QueryObjects</code> with the marker value from
     * the previous call to retrieve the next set of results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The starting point for the results to be returned. For the first call,
     *         this value should be empty. As long as there are more results,
     *         continue to call <code>QueryObjects</code> with the marker value from
     *         the previous call to retrieve the next set of results.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * The starting point for the results to be returned. For the first call,
     * this value should be empty. As long as there are more results,
     * continue to call <code>QueryObjects</code> with the marker value from
     * the previous call to retrieve the next set of results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param marker The starting point for the results to be returned. For the first call,
     *         this value should be empty. As long as there are more results,
     *         continue to call <code>QueryObjects</code> with the marker value from
     *         the previous call to retrieve the next set of results.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * The starting point for the results to be returned. For the first call,
     * this value should be empty. As long as there are more results,
     * continue to call <code>QueryObjects</code> with the marker value from
     * the previous call to retrieve the next set of results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param marker The starting point for the results to be returned. For the first call,
     *         this value should be empty. As long as there are more results,
     *         continue to call <code>QueryObjects</code> with the marker value from
     *         the previous call to retrieve the next set of results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public QueryObjectsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * The maximum number of object names that <code>QueryObjects</code> will
     * return in a single call. The default value is 100.
     *
     * @return The maximum number of object names that <code>QueryObjects</code> will
     *         return in a single call. The default value is 100.
     */
    public Integer getLimit() {
        return limit;
    }
    
    /**
     * The maximum number of object names that <code>QueryObjects</code> will
     * return in a single call. The default value is 100.
     *
     * @param limit The maximum number of object names that <code>QueryObjects</code> will
     *         return in a single call. The default value is 100.
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    /**
     * The maximum number of object names that <code>QueryObjects</code> will
     * return in a single call. The default value is 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param limit The maximum number of object names that <code>QueryObjects</code> will
     *         return in a single call. The default value is 100.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public QueryObjectsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPipelineId() != null) sb.append("PipelineId: " + getPipelineId() + ",");
        if (getQuery() != null) sb.append("Query: " + getQuery() + ",");
        if (getSphere() != null) sb.append("Sphere: " + getSphere() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getLimit() != null) sb.append("Limit: " + getLimit() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPipelineId() == null) ? 0 : getPipelineId().hashCode()); 
        hashCode = prime * hashCode + ((getQuery() == null) ? 0 : getQuery().hashCode()); 
        hashCode = prime * hashCode + ((getSphere() == null) ? 0 : getSphere().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof QueryObjectsRequest == false) return false;
        QueryObjectsRequest other = (QueryObjectsRequest)obj;
        
        if (other.getPipelineId() == null ^ this.getPipelineId() == null) return false;
        if (other.getPipelineId() != null && other.getPipelineId().equals(this.getPipelineId()) == false) return false; 
        if (other.getQuery() == null ^ this.getQuery() == null) return false;
        if (other.getQuery() != null && other.getQuery().equals(this.getQuery()) == false) return false; 
        if (other.getSphere() == null ^ this.getSphere() == null) return false;
        if (other.getSphere() != null && other.getSphere().equals(this.getSphere()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        return true;
    }
    
    @Override
    public QueryObjectsRequest clone() {
        
            return (QueryObjectsRequest) super.clone();
    }

}
    