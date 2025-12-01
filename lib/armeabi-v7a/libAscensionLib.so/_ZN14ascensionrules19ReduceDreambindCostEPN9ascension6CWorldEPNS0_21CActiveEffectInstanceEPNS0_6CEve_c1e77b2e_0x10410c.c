// 函数: _ZN14ascensionrules19ReduceDreambindCostEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0x10410c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg3 + 4) != 8 || *(arg3 + 0x4c) != *(arg2 + 0x14))
    return 0

int32_t r12_1 = *(arg3 + 0x50)

if (r12_1 s< 1)
    return 1

int32_t lr = 0
int32_t* r1_2 = *(arg3 + 0x54) + 0x14

do
    lr += 1
    
    if (*(r1_2 - 4) != 0xffffffff)
        int32_t r4_3 = *r1_2 - arg4
        *r1_2 = r4_3 & not.d(r4_3 s>> 0x1f)
        r12_1 = *(arg3 + 0x50)
    
    r1_2 = &r1_2[0xd]
while (lr s< r12_1)

return 1
