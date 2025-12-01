// 函数: _ZN9ascension21FindEffectTriggerFuncEPKc
// 地址: 0xe834c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r5 = *ascension::s_EffectTriggerFuncList
int32_t r0 = *(ascension::s_EffectTriggerFuncList + 4)

if (r0 == r5)
    return 0

int32_t i = 0

do
    if (strcasecmp(*(r5 + (i << 3)), arg1) == 0)
        return *(r5 + (i << 3) + 4)
    
    i += 1
while (i u< (r0 - r5) s>> 3)

return 0
