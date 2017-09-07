# CustomView-HenCoder
说一下「高级」这个词。同样的一个词，不同的人有不同的理解，不同的位置和环境有不同的定义。A 公司的「高级」，在 B 公司也许叫「中级」，到了 C 公司可能又成了「资深」。想来我最后一次换工作时，薪资涨了不少，职位却是从 「高级 Android 工程师」「降级」成了 「Android Engineer」。所以为了理解的统一，我先明确一下我所指的「高级 Android 工程师」的具体是谁：我这里说的「高级 Android 工程师」，主要指的就是国内大多数小型和微型公司里的 Android 骨干或 Android Leader。这些人在公司的职位通常叫做「高级 Android 工程师」，技术也很不错，但和一些有技术积淀的大公司中的高级工程师相比，他们中的多数人往往（注意是「多数人」「往往」，不是全部，谢绝学我老婆抬杠）底子不够扎实，基础相对薄弱，所以很容易在到达一个还不算很高的技术水平之后，就感到难以继续提升了。他们并不是不想上进，而是不知道应该怎么上进，很多人都已经尝试过很多学习方法，但都好像没有刚入行时那样进步神速，感觉每天都是一个全新的自己了。据我了解，现在中国的程序员中，这样的人非常多。他们是每个公司的骨干，但技术水平却没有达到自己期望的高度（甚至有不少人，也没有达到公司同事以为的高度）。我在这里所说的「高级」，指的就是这些人。

而我做这件事希望可以帮到的，也是这些人。--作者原话

而我,现在虽然不是高级,但是也是需要进阶训练的那些人,这也是这个仓库产生的原因

## Android 开发进阶 UI 部分 1-1：绘制基础 [LINK](http://hencoder.com/ui-1-1/)
Canvas 的 drawXXX() 系列方法及 Paint 最常见的使用
![Android 开发进阶 UI 部分 1-1：绘制基础](https://github.com/TIL-MICE/CustomView-HenCoder/blob/master/PracticeDraw1-master/images/preview_after.png)

## HenCoder Android 开发进阶: 自定义 View 1-2 Paint 详解 [LINK](http://hencoder.com/ui-1-2/)
对于没有深入研究过 Paint 的人，这期是一个对 Paint 的诠释；而对于尝试过研究 Paint 但仍然对其中一些 API 有疑惑的人，这期也可以帮你解惑。
![自定义 View 1-2 Paint 详解](https://github.com/TIL-MICE/CustomView-HenCoder/blob/master/PracticeDraw2-master/images/preview_after.png)
实际项目运行部分与原题同,本人做了部分拓展

## HenCoder Android 开发进阶：自定义 View 1-3 文字的绘制 [LINK](http://hencoder.com/ui-1-3/)
上期的 Paint 详解里已经说过，文字的绘制所能控制的内容太多太细，必须拆成单独的一期专门来讲。今天这期，就是来把这些细节讲清楚的。

需要说明的有两点：

和上期一样，这期讲的是细节，其中有一部分内容并不是很常用，所以这期你不必要求自己把内容全部背会，而只要做到全部理解，知道都有什么东西，大概怎么用就好，到你真正需要用的时候再拐回来看就是；
除了常用和不常用的内容，本期还会讲到一些比较偏门的细节。这些偏门几乎永远不会用到，我讲这些偏门的目的也只是为了做到知识的全覆盖，帮你破开迷雾解开谜团，把那些「始终没有搞懂，也不知道有没有用」的 API 解释出来。有的时候，一样东西你确定了它确实没用，也就够了。所以如果遇到这些偏门的内容，你感兴趣，看看就好；不感兴趣，不看也罢——总之，不要把太多精力放在它们身上。
![自定义 View 1-3 文字的绘制](https://github.com/TIL-MICE/CustomView-HenCoder/blob/master/PracticeDraw3-master/images/preview_after.png)

## HenCoder Android 开发进阶：自定义 View 1-4 Canvas 对绘制的辅助 [LINK](http://hencoder.com/ui-1-4/)
Canvas 对绘制的辅助——范围裁切和几何变换。
![Canvas 对绘制的辅助——范围裁切和几何变换。](https://github.com/TIL-MICE/CustomView-HenCoder/blob/master/PracticeDraw4-master/images/preview_after.png)

这一章节涉及的内容比较复杂,主要是很多没接触过,得细细品味才有收获,

## HenCoder Android 开发进阶：自定义 View 1-5 绘制顺序[LINK](http://hencoder.com/ui-1-5/)
前面几期讲的是「术」，是「用哪些 API 可以绘制什么内容」。到上一期为止，「术」已经讲完了，接下来要讲的是「道」，是「怎么去安排这些绘制」。

这期是「道」的第一期：绘制顺序。

Android 里面的绘制都是按顺序的，先绘制的内容会被后绘制的盖住。比如你在重叠的位置先画圆再画方，和先画方再画圆所呈现出来的结果肯定是不同的：

而在实际的项目中，绘制内容相互遮盖的情况是很普遍的，那么怎么实现自己需要的遮盖关系，就是这期要讲的内容。
![自定义 View 1-5 绘制顺序](https://github.com/TIL-MICE/CustomView-HenCoder/blob/master/PracticeDraw5-master/images/preview_after.png)
