// 函数: _ZN14ascensionrules40CStateProcessAcquireOrDefeatAnyCenterRow31SelectDefeatFromTheVoidIntoPlayER13CStateMachineP6CStateiPj
// 地址: 0x12b358
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg3 == 0)
    return 

ascension::CPlayer* r6 = *(arg2 + 0x24c)
int32_t r7 = *(r6 + 4)

if (zx.d(*(r7 + 0xb34)) == 0)
    ascension::CWorld::RemoveDefeatNonTrophyMonsterFromVoid(r7)

core::CWorldBase::OutputMessageFormat(r7, "%s defeats %s from The Void into play\n", r6 + 0x10, 
    *(arg3 + 0xc) + 4)
ascensionrules::CreateStateProcessDefeatMonsterSequence(r6, arg3, 9, 0xfffffffe, 4, false, true, 
    false, nullptr, 0)
CState::AddOwnedChild(arg2)
CStateList::AppendState(arg2)
*(arg2 + 0xced) = 1
