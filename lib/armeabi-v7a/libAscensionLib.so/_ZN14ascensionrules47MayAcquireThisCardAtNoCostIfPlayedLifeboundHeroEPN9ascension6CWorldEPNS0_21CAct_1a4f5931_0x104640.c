// 函数: _ZN14ascensionrules47MayAcquireThisCardAtNoCostIfPlayedLifeboundHeroEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0x104640
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0

if (*(arg3 + 4) == 6)
    result = 1
    
    if (*(arg3 + 0x50) s>= 1)
        int32_t r4_1 = *(arg2 + 0x10)
        int32_t r5_1 = 0
        int32_t i = 0
        
        do
            if (*(*(arg3 + 0x54) + r5_1) == r4_1 && *(arg3 + 0x4c) == *(arg1 + 0xb20)
                    && ascension::CWorld::GetPlayedHeroCount(arg1, 2, nullptr) s>= arg4)
                *(*(arg3 + 0x54) + r5_1 + 0x14) = 0
            
            i += 1
            r5_1 += 0x44
        while (i s< *(arg3 + 0x50))

return result
