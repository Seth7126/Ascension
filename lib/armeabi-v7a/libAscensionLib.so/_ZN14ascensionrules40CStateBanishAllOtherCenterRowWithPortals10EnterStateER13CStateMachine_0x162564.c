// 函数: _ZN14ascensionrules40CStateBanishAllOtherCenterRowWithPortals10EnterStateER13CStateMachine
// 地址: 0x162564
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* __offset(CStateMachine, 0x40) r5 = arg1 + 0x40
int32_t i = 0
int32_t r0 = *__stack_chk_guard
ascension::CPlayer* r10 = *(*(arg1 + 0x38) + 4)
char var_2f

do
    (&var_2f)[i] = 0
    
    if (i != *(arg1 + 0x3c))
        core::CCardInstance* r0_4 = ascension::CWorld::GetCenterRowCard(r10)
        
        if (r0_4 != 0 && ascension::CWorld::QueryCanBanish(r10, nullptr) != 0)
            (&var_2f)[i] = 1
            core::CWorldBase::OutputMessageFormat(r10, "%s is banished from center row\n", 
                (*(*r0_4 + 0xc))(r0_4))
            ascensionrules::CreateStateProcessBanishSequence(*(arg1 + 0x38), r0_4, 7, i)
            CState::AddOwnedChild(arg1)
            CStateList::AppendState(arg1)
            ascensionrules::CreateStateRemoveCenterRowCard(*(arg1 + 0x38), i, nullptr, true, false, 
                0, 0, true, nullptr, r5, 0, nullptr, 0)
            CState::AddOwnedChild(arg1)
            CStateList::AppendState(arg1)
    
    i += 1
    r5 += 0x84
while (i != 7)

if (zx.d(var_2f) != 0)
    ascensionrules::CreateStateProcessPendingCenterRowEffect(*(arg1 + 0x38), arg1 + 0x40, nullptr, 
        0)
    CState::AddOwnedChild(arg1)
    CStateList::AppendState(arg1)

char var_2e

if (zx.d(var_2e) != 0)
    ascensionrules::CreateStateProcessPendingCenterRowEffect(*(arg1 + 0x38), arg1 + 0xc4, nullptr, 
        0)
    CState::AddOwnedChild(arg1)
    CStateList::AppendState(arg1)

char var_2d

if (zx.d(var_2d) != 0)
    ascensionrules::CreateStateProcessPendingCenterRowEffect(*(arg1 + 0x38), arg1 + 0x148, nullptr, 
        0)
    CState::AddOwnedChild(arg1)
    CStateList::AppendState(arg1)

char var_2c

if (zx.d(var_2c) != 0)
    ascensionrules::CreateStateProcessPendingCenterRowEffect(*(arg1 + 0x38), arg1 + 0x1cc, nullptr, 
        0)
    CState::AddOwnedChild(arg1)
    CStateList::AppendState(arg1)

char var_2b

if (zx.d(var_2b) != 0)
    ascensionrules::CreateStateProcessPendingCenterRowEffect(*(arg1 + 0x38), arg1 + 0x250, nullptr, 
        0)
    CState::AddOwnedChild(arg1)
    CStateList::AppendState(arg1)

char var_2a

if (zx.d(var_2a) != 0)
    ascensionrules::CreateStateProcessPendingCenterRowEffect(*(arg1 + 0x38), arg1 + 0x2d4, nullptr, 
        0)
    CState::AddOwnedChild(arg1)
    CStateList::AppendState(arg1)

char var_29

if (zx.d(var_29) != 0)
    ascensionrules::CreateStateProcessPendingCenterRowEffect(*(arg1 + 0x38), arg1 + 0x358, nullptr, 
        0)
    CState::AddOwnedChild(arg1)
    CStateList::AppendState(arg1)

int32_t r0_54 = *__stack_chk_guard

if (r0_54 == r0)
    return r0_54 - r0

__stack_chk_fail()
noreturn
