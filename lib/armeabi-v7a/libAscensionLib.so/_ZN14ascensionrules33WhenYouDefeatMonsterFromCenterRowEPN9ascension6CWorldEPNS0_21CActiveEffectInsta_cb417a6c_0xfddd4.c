// 函数: _ZN14ascensionrules33WhenYouDefeatMonsterFromCenterRowEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfddd4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg3 + 4) == 0x1b)
    int32_t lr_1 = *(arg3 + 0x54)
    
    if (lr_1 u<= 9 && (0x290 & 1 << (lr_1 & 0xff)) != 0)
        if (*(arg3 + 0x4c) != *(arg2 + 0x14))
            return 0
        
        int32_t temp0_1 = 0
        uint32_t i = *(*(*(arg3 + 0x50) + 0xc) + 0x88) - 3
        
        while (i != 0)
            i u>>= 1
            temp0_1 += 1
        
        return (0x20 - temp0_1) u>> 5

return 0
