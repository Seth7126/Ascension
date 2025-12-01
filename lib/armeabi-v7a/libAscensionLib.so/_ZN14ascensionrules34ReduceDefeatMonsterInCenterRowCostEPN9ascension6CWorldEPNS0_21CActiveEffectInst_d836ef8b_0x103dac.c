// 函数: _ZN14ascensionrules34ReduceDefeatMonsterInCenterRowCostEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0x103dac
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg3 + 4) != 8 || *(arg3 + 0x4c) != *(arg2 + 0x14))
    return 0

int32_t r12_1 = *(arg3 + 0x50)

if (r12_1 s< 1)
    return 1

int32_t r4 = 0
int32_t* r2 = *(arg3 + 0x54) + 0xc

do
    int32_t lr_1 = *(r2 - 8)
    
    if ((lr_1 == 9 || lr_1 == 7) && *(*(*(r2 - 0xc) + 0xc) + 0x88) == 3)
        *r2 -= arg4
    
    r4 += 1
    r2 = &r2[0xd]
while (r4 s< r12_1)

return 1
