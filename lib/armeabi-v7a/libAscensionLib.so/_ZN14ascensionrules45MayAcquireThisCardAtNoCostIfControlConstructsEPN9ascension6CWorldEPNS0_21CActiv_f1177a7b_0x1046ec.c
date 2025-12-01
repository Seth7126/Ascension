// 函数: _ZN14ascensionrules45MayAcquireThisCardAtNoCostIfControlConstructsEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0x1046ec
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0

if (*(arg3 + 4) == 6)
    result = 1
    
    if (*(arg3 + 0x50) s>= 1)
        int32_t r7_1 = *(arg2 + 0x10)
        int32_t r4_1 = 0
        int32_t i = 0
        
        do
            if (*(*(arg3 + 0x54) + r4_1) == r7_1)
                int32_t r0_4 = *(arg3 + 0x4c)
                
                if (r0_4 != 0 && ascension::CPlayer::CountConstructsInPlay(r0_4, false, nullptr)
                        u>= arg4)
                    *(*(arg3 + 0x54) + r4_1 + 0x14) = 0
            
            i += 1
            r4_1 += 0x44
        while (i s< *(arg3 + 0x50))

return result
