// 函数: _ZN14ascensionrules39WhenYouPutFirstMechanaConstructIntoPlayEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfe1d0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (*(arg3 + 4) == 0x18)
    core::CCardInstance* r5_1 = *(arg3 + 0x4c)
    
    if (r5_1 == *(*(arg2 + 0x10) + 0xc))
        int32_t r0_4 = *(arg1 + 0x30)
        int32_t r6_1 = *(arg3 + 0x50)
        int32_t r0_8
        
        if (r0_4 u<= 3)
            int32_t temp0_1 = 0
            uint32_t i = r0_4 - 1
            
            while (i != 0)
                i u>>= 1
                temp0_1 += 1
            
            r0_8 = ascension::CWorld::GetPlayedConstructCount(arg1, true, (0x20 - temp0_1) u>> 5)
        
        if (r0_4 u> 3 || r0_8 s<= 0)
            return ascension::CWorld::QueryCardFaction(arg1, r5_1, r6_1) __tailcall

return 0
