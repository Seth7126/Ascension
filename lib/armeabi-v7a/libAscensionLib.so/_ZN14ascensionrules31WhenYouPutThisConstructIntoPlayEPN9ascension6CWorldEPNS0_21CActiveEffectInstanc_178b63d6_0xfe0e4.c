// 函数: _ZN14ascensionrules31WhenYouPutThisConstructIntoPlayEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfe0e4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg3 + 4) != 0x18)
    return 0

void* r12_1 = *(arg2 + 0x10)

if (*(arg3 + 0x4c) != *(r12_1 + 0xc))
    return 0

int32_t temp0_1 = 0
uint32_t i = zx.d(*(*(arg3 + 0x50) + 8)) - zx.d(*(*(r12_1 + 0x10) + 8))

while (i != 0)
    i u>>= 1
    temp0_1 += 1

return (0x20 - temp0_1) u>> 5
