/*
 * Copyright [2016] [xsun]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.xsun.lightexam.windowsoperation;

import com.xsun.lightexam.operation.CheckPoint;
import com.xsun.lightexam.operation.OperationQuestion;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * Created by xsun on 2016/7/28.
 */
public class WindowsOperationQuestion extends OperationQuestion {

    private String target;

    public WindowsOperationQuestion(String requirement, List<CheckPoint> checkPoints, String target) {
        super(requirement, checkPoints);
        this.target = target;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("requirement", getRequirement())
                .append("target", target)
                .toString();
    }
}
