// 函数: _ZN14ascensionrules21MayDefeatThisAtNoCostEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0x1040a4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0

if (*(arg3 + 4) == 8)
    int32_t lr_1 = *(arg3 + 0x50)
    result = 1
    
    if (lr_1 s< 1)
        return 1
    
    int32_t r12_1 = *(arg2 + 0x10)
    int32_t* r2 = *(arg3 + 0x54) + 0xc
    int32_t r1_1 = 0
    
    do
        r1_1 += 1
        
        if (*(r2 - 8) == 7 && *(r2 - 0xc) == r12_1)
            *r2 -= 0x14
        
        r2 = &r2[0xd]
    while (r1_1 s< lr_1)

return result
