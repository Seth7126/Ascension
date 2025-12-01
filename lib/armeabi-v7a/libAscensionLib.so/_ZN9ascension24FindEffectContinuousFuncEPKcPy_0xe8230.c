// 函数: _ZN9ascension24FindEffectContinuousFuncEPKcPy
// 地址: 0xe8230
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = *ascension::s_EffectContinuousFuncList
int32_t r1 = *(ascension::s_EffectContinuousFuncList + 4)

if (r1 != r0)
    int32_t* r6_1 = r0 + 4
    int32_t i = 0
    
    do
        if (strcasecmp(*(r6_1 - 4), arg1) == 0)
            if (arg2 != 0)
                *arg2 = *(r6_1 + 4)
            
            return *r6_1
        
        i += 1
        r6_1 = &r6_1[4]
    while (i u< (r1 - r0) s>> 4)

return 0
