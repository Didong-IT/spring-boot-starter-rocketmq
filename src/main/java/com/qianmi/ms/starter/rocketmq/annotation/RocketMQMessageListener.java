/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.qianmi.ms.starter.rocketmq.annotation;

import com.qianmi.ms.starter.rocketmq.enums.ConsumeMode;
import com.qianmi.ms.starter.rocketmq.enums.SelectorType;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.apache.rocketmq.common.protocol.heartbeat.MessageModel;

/**
 * RocketMQMessageListener Created by aqlu on 2017/9/27.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RocketMQMessageListener {

    String consumerGroup();

    String topic();

    SelectorType selectorType() default SelectorType.TAG;

    String selectorExpress() default "*";

    ConsumeMode consumeMode() default ConsumeMode.CONCURRENTLY;

    MessageModel messageModel() default MessageModel.CLUSTERING;

    int consumeThreadMax() default 64;

}
