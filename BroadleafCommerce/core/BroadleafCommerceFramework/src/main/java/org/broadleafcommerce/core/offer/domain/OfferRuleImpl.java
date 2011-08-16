/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.broadleafcommerce.core.offer.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * 
 * @author jfischer
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "BLC_OFFER_RULE")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region="blStandardElements")
public class OfferRuleImpl implements OfferRule {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "OfferRuleId", strategy = GenerationType.TABLE)
    @TableGenerator(name = "OfferRuleId", table = "SEQUENCE_GENERATOR", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", pkColumnValue = "OfferRuleImpl", allocationSize = 50)
    @Column(name = "OFFER_RULE_ID")
    protected Long id;
    
    @Lob
    @Column(name = "MATCH_RULE")
    protected String matchRule;

	/* (non-Javadoc)
	 * @see org.broadleafcommerce.core.offer.domain.OfferRule#getId()
	 */
	public Long getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see org.broadleafcommerce.core.offer.domain.OfferRule#setId(java.lang.Long)
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see org.broadleafcommerce.core.offer.domain.OfferRule#getMatchRule()
	 */
	public String getMatchRule() {
		return matchRule;
	}

	/* (non-Javadoc)
	 * @see org.broadleafcommerce.core.offer.domain.OfferRule#setMatchRule(java.lang.String)
	 */
	public void setMatchRule(String matchRule) {
		this.matchRule = matchRule;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((matchRule == null) ? 0 : matchRule.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OfferRuleImpl other = (OfferRuleImpl) obj;
		
		if (id != null && other.id != null) {
            return id.equals(other.id);
        }
		
		if (matchRule == null) {
			if (other.matchRule != null)
				return false;
		} else if (!matchRule.equals(other.matchRule))
			return false;
		return true;
	}
    
}