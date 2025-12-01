// 函数: _ZN14ascensionrules40CStateProcessAcquireOrDefeatAnyCenterRow25SelectDefeatFromConstructER13CStateMachineP6CStateiPj
// 地址: 0x12b01c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = *(arg3 + 0x4c)
core::CCardInstance* r5 = *(result - 4)

if (r5 != 0)
    ascension::CPlayer* r6_1 = *(arg2 + 0x24c)
    core::CWorldBase::OutputMessageFormat(*(r6_1 + 4), "%s defeats %s\n", r6_1 + 0x10, 
        *(r5 + 0xc) + 4)
    ascensionrules::CreateStateProcessDefeatMonsterSequence(r6_1, r5, 4, zx.d(*(r6_1 + 8)), 9, 
        false, true, false, nullptr, 0)
    CState::AddOwnedChild(arg2)
    result = CStateList::AppendState(arg2)
    *(arg2 + 0xced) = 1

return result
