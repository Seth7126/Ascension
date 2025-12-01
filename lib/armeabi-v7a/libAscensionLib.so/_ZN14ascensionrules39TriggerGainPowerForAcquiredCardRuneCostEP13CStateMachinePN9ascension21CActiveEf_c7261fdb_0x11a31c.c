// 函数: _ZN14ascensionrules39TriggerGainPowerForAcquiredCardRuneCostEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11a31c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg4 + 4) != 0x12)
    return 

void* r12 = *(arg4 + 0x50)

if (r12 == 0)
    return 

ascension::CPlayer* r12_1 = *(arg2 + 0x14)
ascensionrules::GainPower(arg1, *(r12_1 + 4), r12_1, *(*(r12 + 0xc) + 0x98), arg3, nullptr, arg4)
