// 函数: _ZN14ascensionrules24CStateMayDoubleHonorGain21SelectDoubleHonorGainER13CStateMachineP6CStateiPj
// 地址: 0x1550ec
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r1 = *(arg2 + 0x250)
ascension::CActiveEffectInstance* r0_1 = *(*(arg2 + 0x24c) + 4)
*(r1 + 0x58) <<= 1

if (*(arg2 + 0x254) != 0)
    ascension::CWorld::PlayActiveEffect(r0_1)

*(arg2 + 0x258) = 1
return 1
