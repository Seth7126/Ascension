// 函数: _ZNK14ascensionrules33CStatePutAllConstructsOnTopOfDeck10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x13f338
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x30) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x34)
    result = operator new(0x34)
    CState::CState()
    *(result + 0x30) = r0_2
    *result = _vtable_for_ascensionrules::CStatePutAllConstructsOnTopOfDeck + 8
else
    CState::CState()
    *(result + 0x30) = r0_2
    *result = _vtable_for_ascensionrules::CStatePutAllConstructsOnTopOfDeck + 8
    *(result + 0x2c) = 0
    *arg4 += 0x34
    *arg_0 -= 0x34

*(result + 0x28) = arg1
return result
