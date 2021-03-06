/*
 * Copyright 2012 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.springframework.web.servlet.view.mustache;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

import org.junit.Test;

public class EncodingUtilTest {

	@Test
	public void utf8ShouldBeTheDefault() {
		System.clearProperty("mustache.template.encoding");
		assertThat(EncodingUtil.getEncoding(), equalTo("UTF-8"));
	}

	@Test
	public void shouldBeAbleToSetTheEncoding() {
		System.setProperty("mustache.template.encoding", "ISO-8859-1");
		assertThat(EncodingUtil.getEncoding(), equalTo("ISO-8859-1"));
		System.clearProperty("mustache.template.encoding");
	}

	@Test
	public void shouldHaveADefaultConstructor() {
		assertThat(new EncodingUtil(), notNullValue());
	}
}
