// 函数: _ZN14ascensionrules43CStateProcessAcquireOrDefeatTopOfCenterDeck18SelectDefeatTrophyER13CStateMachineP6CStateiPj
// 地址: 0x13265c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg3 == 0)
    return 

int32_t lr
int32_t var_4 = lr
ascension::CPlayer* r6 = *(arg2 + 0x24c)
core::CWorldBase::OutputMessageFormat(*(r6 + 4), "%s defeats %s\n", r6 + 0x10, 
    (*(*arg3 + 0xc))(arg3))
ascensionrules::CreateStateProcessDefeatMonsterSequence(r6, arg3, 0xc, 0, 5, false, true, false, 
    nullptr, 0)
CState::AddOwnedChild(arg2)
return CStateList::AppendState(arg2) __tailcall
