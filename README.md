TempFilePath: `{project.basedir}\src\main\java\com\zzuhkp`

CodeFileName: `$!velocityTool.camelCaseName(${question.titleSlug})`

CodeTemplate:
```
${question.content}
  
package com.zzuhkp.leetcode.editor.cn;

/**
 * 题目编号: ${question.frontendQuestionId}
 * 题目标题: ${question.title}
 * 
 * @date $!velocityTool.date()
 */
public class $!velocityTool.camelCaseName(${question.titleSlug}){

    public static void main(String[] args) {
        Solution solution = new $!velocityTool.camelCaseName(${question.titleSlug})().new Solution();
    }
     
    ${question.code}
}
```