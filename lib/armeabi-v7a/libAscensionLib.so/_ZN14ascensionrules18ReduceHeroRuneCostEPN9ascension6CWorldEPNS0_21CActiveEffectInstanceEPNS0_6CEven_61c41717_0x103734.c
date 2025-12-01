// 函数: _ZN14ascensionrules18ReduceHeroRuneCostEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0x103734
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg3 + 4) != 6 || *(arg3 + 0x4c) != *(arg2 + 0x14))
    return 0

int32_t r12_1 = *(arg3 + 0x50)

if (r12_1 s< 1)
    return 1

int32_t lr = 0
int32_t* r2 = *(arg3 + 0x54) + 0xc

do
    lr += 1
    
    if (*(*(*(r2 - 0xc) + 0xc) + 0x88) == 1)
        *r2 -= arg4
    
    r2 = &r2[0x11]
while (lr s< r12_1)

return 1
