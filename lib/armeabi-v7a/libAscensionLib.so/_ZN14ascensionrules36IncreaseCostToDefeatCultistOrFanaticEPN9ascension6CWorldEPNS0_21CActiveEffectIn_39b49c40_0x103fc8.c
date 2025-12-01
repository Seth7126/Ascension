// 函数: _ZN14ascensionrules36IncreaseCostToDefeatCultistOrFanaticEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0x103fc8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0

if (*(arg3 + 4) == 8)
    int32_t r12_1 = *(arg3 + 0x50)
    result = 1
    
    if (r12_1 s< 1)
        return 1
    
    int32_t lr_1 = 0
    int32_t* r2 = *(arg3 + 0x54) + 0xc
    
    do
        if (*(r2 - 8) == 6 && *(*(*(r2 - 0xc) + 0xc) + 0x88) == 3)
            *r2 += arg4
        
        lr_1 += 1
        r2 = &r2[0xd]
    while (lr_1 s< r12_1)

return result
