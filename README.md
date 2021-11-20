TempFilePath: `{project.basedir}\src\main\java\com\zzuhkp`

CodeFileName: `_$!{question.frontendQuestionId}_$!velocityTool.camelCaseName(${question.titleSlug})`

CodeTemplate:
```
${question.content}

package com.zzuhkp.leetcode.editor.cn;

public class _$!{question.frontendQuestionId}_$!velocityTool.camelCaseName(${question.titleSlug}){

    public static void main(String[] args) {
        Solution solution = new _$!{question.frontendQuestionId}_$!velocityTool.camelCaseName(${question.titleSlug})().new Solution();
    }
     
    ${question.code}
}
```