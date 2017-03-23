/*
 * Copyright 2015-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.common.log;

import org.apache.log4j.BasicConfigurator;

/**
 * Used to delegate internal logging of the signers and core classes to Jakarta
 * Commons Logging.
 */
public class CommonsLogTest  {

	private final static InternalLogApi LOG = new CommonsLogFactory().doGetLog(CommonsLog.class);
	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		LOG.debug(" show debug meaage ");
		
	}
    
}