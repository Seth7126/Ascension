// 函数: _ZN14ascensionrules29WhenYouDefeatMonsterWithPowerEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfdeb0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0

if (*(arg3 + 4) == 0x1b)
    int32_t lr_1 = *(arg3 + 0x54)
    
    if (lr_1 u<= 9 && (0x290 & 1 << (lr_1 & 0xff)) != 0)
        if (*(arg3 + 0x4c) != *(arg2 + 0x14))
            return 0
        
        result = 1
        
        if (*(arg1 + 0x30) u<= 3)
            void* r1_2 = *(*(arg3 + 0x50) + 0xc)
            result = 0
            
            if (*(r1_2 + 0x88) == 3)
                result = 0
                
                if (*(r1_2 + 0xa0) s>= arg4)
                    return 1

return result
