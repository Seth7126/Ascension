// 函数: _ZN14ascensionrules24CStateBanishAllCenterRow10EnterStateER13CStateMachine
// 地址: 0x13a558
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t i = 0
int32_t r0 = *__stack_chk_guard
int32_t r5 = *(*(arg1 + 0x38) + 4)
char var_2f

do
    (&var_2f)[i] = 0
    int32_t* r0_5 = ascension::CWorld::GetCenterRowCard(r5)
    
    if (r0_5 != 0)
        int32_t* r0_7 = ascension::CWorld::GetCenterRowCardStackList(r5)
        
        if (r0_7 != 0)
            if (zx.d(*(arg1 + 0x3c)) == 0)
            label_13a620:
                
                if (ascension::CWorld::QueryCanBanish(r5, nullptr) != 0)
                    (&var_2f)[i] = 1
                    core::CWorldBase::OutputMessageFormat(r5, "%s is banished from center row\n", 
                        (*(*r0_5 + 0xc))(r0_5))
                    int32_t r8_1 = *(arg1 + 0x38)
                    void** r0_15 = operator new(0x9c)
                    CState::CState()
                    *r0_15 = _vtable_for_ascensionrules::CStateProcessBanishSequence + 8
                    r0_15[0xc] = r8_1
                    r0_15[0xd] = r0_5
                    r0_15[0xe] = 7
                    r0_15[0xf] = i
                    r0_15[0x10].b = 0
                    r0_15[0x11] = _vtable_for_ascension::CEventBanishCard + 8
                    r0_15[0x12] = 0x1d
                    r0_15[0x13] = 0
                    r0_15[0x24] = r8_1
                    r0_15[0x25] = 0
                    r0_15[0x26] = 0
                    CState::AddOwnedChild(arg1)
                    CStateList::AppendState(arg1)
            else
                int32_t r1_4 = *r0_7
                int32_t r0_8 = r0_7[1]
                
                if (r0_8 != r1_4)
                    while (*(r0_8 - 4) != 3)
                        r0_8 -= 8
                        
                        if (r1_4 == r0_8)
                            goto label_13a6cc
                    
                    goto label_13a620
    
label_13a6cc:
    i += 1
while (i u< 7)

void* __offset(CStateMachine, 0x40) r6_2 = arg1 + 0x40

for (int32_t i_1 = 0; i_1 != 7; )
    if (zx.d((&var_2f)[i_1]) != 0)
        ascensionrules::CreateStateRemoveCenterRowCard(*(arg1 + 0x38), i_1, nullptr, true, false, 
            0, 0, false, nullptr, r6_2, 0, nullptr, 0)
        CState::AddOwnedChild(arg1)
        CStateList::AppendState(arg1)
    
    i_1 += 1
    r6_2 += 0x84

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

int32_t r0_59 = *__stack_chk_guard

if (r0_59 == r0)
    return r0_59 - r0

__stack_chk_fail()
noreturn
