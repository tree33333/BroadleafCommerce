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

package org.broadleafcommerce.openadmin.client.presentation;

/**
 * 
 * @author jfischer
 *
 */
public enum SupportedFieldType {
	UNKNOWN,
	ID,
	BOOLEAN,
	DATE,
	INTEGER,
	DECIMAL,
	STRING,
	PASSWORD,
	EMAIL,
	FOREIGN_KEY,
	ADDITIONAL_FOREIGN_KEY,
	MONEY,
	BROADLEAF_ENUMERATION,
    EXPLICIT_ENUMERATION,
	EMPTY_ENUMERATION,
    HTML,
    HTML_BASIC,
    UPLOAD,
    HIDDEN,
    ASSET,
    ASSET_URL
}
