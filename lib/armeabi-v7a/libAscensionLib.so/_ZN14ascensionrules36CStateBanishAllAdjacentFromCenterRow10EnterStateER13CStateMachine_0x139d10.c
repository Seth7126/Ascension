// 函数: _ZN14ascensionrules36CStateBanishAllAdjacentFromCenterRow10EnterStateER13CStateMachine
// 地址: 0x139d10
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r10 = 0
int32_t i = 0
int32_t r0 = *__stack_chk_guard
char* r9 = *(*(arg1 + 0x38) + 4)
char var_2f

do
    (&var_2f)[i] = 0
    int32_t r0_4 = *(arg1 + 0x3c)
    int32_t r1_1
    
    if (r0_4 u<= 6)
        r1_1 = r10 + r0_4
        
        if (r1_1 s< 0)
            r1_1 = i - r0_4
    
    if (r0_4 u> 6 || r1_1 == 1)
        int32_t* r0_6 = ascension::CWorld::GetCenterRowCard(r9)
        
        if (r0_6 != 0 && ascension::CWorld::QueryCanBanish(r9, nullptr) != 0)
            (&var_2f)[i] = 1
            core::CWorldBase::OutputMessageFormat(r9, "%s is banished from center row\n", 
                (*(*r0_6 + 0xc))(r0_6))
            int32_t r4_1 = *(arg1 + 0x38)
            void** r0_13 = operator new(0x9c)
            CState::CState()
            *r0_13 = _vtable_for_ascensionrules::CStateProcessBanishSequence + 8
            r0_13[0xc] = r4_1
            r0_13[0xd] = r0_6
            r0_13[0xe] = 7
            r0_13[0xf] = i
            r0_13[0x10].b = 0
            r0_13[0x11] = _vtable_for_ascension::CEventBanishCard + 8
            r0_13[0x12] = 0x1d
            r0_13[0x13] = 0
            r0_13[0x24] = r4_1
            r0_13[0x25] = 0
            r0_13[0x26] = 0
            CState::AddOwnedChild(arg1)
            CStateList::AppendState(arg1)
    
    i += 1
    r10 -= 1
while (i u< 7)

void* __offset(CStateMachine, 0x40) r7 = arg1 + 0x40

for (int32_t i_1 = 0; i_1 != 7; )
    if (zx.d((&var_2f)[i_1]) != 0)
        ascensionrules::CreateStateRemoveCenterRowCard(*(arg1 + 0x38), i_1, nullptr, true, false, 
            0, 0, false, nullptr, r7, 0, nullptr, 0)
        CState::AddOwnedChild(arg1)
        CStateList::AppendState(arg1)
    
    i_1 += 1
    r7 += 0x84

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

int32_t r0_57 = *__stack_chk_guard

if (r0_57 == r0)
    return r0_57 - r0

__stack_chk_fail()
noreturn
