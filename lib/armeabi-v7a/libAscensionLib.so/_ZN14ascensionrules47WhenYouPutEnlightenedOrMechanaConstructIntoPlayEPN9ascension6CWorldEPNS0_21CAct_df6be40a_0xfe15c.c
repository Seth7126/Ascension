// 函数: _ZN14ascensionrules47WhenYouPutEnlightenedOrMechanaConstructIntoPlayEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfe15c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t result = 0

if (*(arg3 + 4) == 0x18)
    core::CCardInstance* r5_1 = *(arg3 + 0x4c)
    
    if (r5_1 == *(*(arg2 + 0x10) + 0xc))
        int32_t r6_1 = *(arg3 + 0x50)
        result = 1
        
        if (ascension::CWorld::QueryCardFaction(arg1, r5_1, r6_1) == 0)
            return ascension::CWorld::QueryCardFaction(arg1, r5_1, r6_1) __tailcall

return result
